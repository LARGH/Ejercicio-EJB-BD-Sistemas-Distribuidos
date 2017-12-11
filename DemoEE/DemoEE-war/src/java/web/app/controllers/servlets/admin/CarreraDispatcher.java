package web.app.controllers.servlets.admin;

import com.ipn.bean.CarreraServiceRemote;
import com.ipn.mx.model.Alumno;
import com.ipn.mx.model.Carrera;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rafael Landa
 */
public class CarreraDispatcher extends HttpServlet {

    @EJB
    private CarreraServiceRemote carreraService;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response)
                throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        if (request.getParameter("accion").equals("agregar")) {
            agregarCarrera(request, response);
        } 
        else if (request.getParameter("accion").equals("borrar")) {
            borrarCarrera(request, response);
        } 
        else if (request.getParameter("accion").equals("editar")) {
            if (request.getParameter("event").equals("selected")) {
                sendToEditCarrera(request, response);
            } 
            else if (request.getParameter("event").equals("clickEdit")) {
                editarCarrera(request, response);
            }
        } 
        else if (request.getParameter("accion").equals("verCarrera")) {
            if (request.getParameter("event").equals("selected")) {
                sendToCarreraSelected(request, response);
            } 
            else if (request.getParameter("event").equals("selectCarrera")) {
                verCarreraSeleccionada(request, response);
            }
        } 
        else if (request.getParameter("accion").equals("readAll")) {
            getTodasCarreras(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Servlet dispatcher of carreras";
    }// </editor-fold>

    private void agregarCarrera(
        HttpServletRequest request, HttpServletResponse response)
            throws UnsupportedEncodingException {
        Carrera carrera = new Carrera();
        carrera.setNombre(request.getParameter("nombre"));
        carrera.setDescripcion(request.getParameter("descripcion"));
        carrera.setStatus(false);
        carrera.setAlumnoList(new ArrayList<>(0));
        
        System.out.println("Nombre carrera: " + carrera.getNombre());
        System.out.println("Descripcion carrera: " + carrera.getDescripcion());
        System.out.println("status carrera: " + carrera.getStatus());
        
        try {
            carreraService.create(carrera);
        } catch (Exception ex) {
            response.setHeader(
                "register-carrera-header", 
                "error");
            return;
        }
        //Respuesta al servidor
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            System.out.println("Respondiendo al cliente.");
            JsonObjectBuilder messageBuilder = Json.createObjectBuilder();
            messageBuilder.add("status", "registered");
            response.setHeader(
                "register-carrera-header", 
                "success");
            out.print(messageBuilder.build());
            out.flush();
            System.out.println("Carrera registrada. Mensaje enviado!");
        } catch (IOException ex) {
            System.err.println("Mensaje error:" + ex.getMessage());
        }
    }

    private void borrarCarrera(
        HttpServletRequest request, HttpServletResponse response) {
        int idCarrera = Integer.parseInt(request.getParameter("id"));
        String nombreCarrera = request.getParameter("name");
        Carrera carrera = new Carrera();
        carrera.setNombre(nombreCarrera);
        carrera.setIdCarrera(idCarrera);
        carrera.setStatus(false);
        
        try {
            carreraService.delete(carrera);
        } catch (Exception ex) {
            response.setHeader(
                "delete-carrera-header", 
                "error");
            return;
        }
        
        //Respuesta al servidor
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            System.out.println("Respondiendo al cliente.");
            JsonObjectBuilder messageBuilder = 
                Json.createObjectBuilder();
            messageBuilder
                    .add("status", "updated")
                    .add("data", carrera.getNombre());
            response.setHeader(
                "delete-carrera-header", 
                "success");
            out.print(messageBuilder.build());
            out.flush();
        } catch (IOException ex) {
            System.err.println("Mensaje error:" + ex.getMessage());
        }
    }

    private void editarCarrera(
        HttpServletRequest request, HttpServletResponse response) {
        int idCarrera = Integer.parseInt(request.getParameter("id"));
        String nombreCarrera = request.getParameter("name");
        boolean status = Boolean.parseBoolean(request.getParameter("status"));
        String descripcion = request.getParameter("descripcion");
        Carrera carrera = new Carrera();
        carrera.setIdCarrera(idCarrera);
        carrera.setNombre(nombreCarrera);
        carrera.setStatus(status);
        carrera.setDescripcion(descripcion);
        try {
            carreraService.update(carrera);
        } catch (Exception ex) {
            response.setHeader(
                "update-carrera-header", 
                "error");
            return;
        }
        
        //Respuesta al servidor
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            System.out.println("Respondiendo al cliente.");
            JsonObjectBuilder messageBuilder = 
                Json.createObjectBuilder();
            messageBuilder
                    .add("status", "updated")
                    .add("data", carrera.getNombre())
                    .add("status", carrera.getStatus())
                    .add("desc", carrera.getDescripcion());
            response.setHeader(
                "update-carrera-header", 
                "success");
            out.print(messageBuilder.build());
            out.flush();
        } catch (IOException ex) {
            System.err.println("Mensaje error:" + ex.getMessage());
        }
    }

    private void verCarreraSeleccionada(
        HttpServletRequest request, HttpServletResponse response) 
            throws UnsupportedEncodingException {
        Carrera carrera = new Carrera();
        carrera.setIdCarrera(Integer.parseInt(request.getParameter("id")));
        carrera.setNombre(request.getParameter("nombre"));
        List<Alumno> alumnos;
        try {
            System.out.println("Conectandose al servidor.");
            alumnos = 
                carreraService.obtenerInscritos(carrera);
            System.out.println("Alumnos obtenidos...");
        } catch (Exception ex) {
            response.setHeader(
                "server-response-header", 
                "error");
            return;
        }
        
        if (alumnos != null) {
            if (!alumnos.isEmpty()) {
                System.out.println("ALUMNOS:");
                for (Alumno alumno : alumnos) {
                    System.out.println("Nombre: " + alumno.getNombre());
                    System.out.println("Ap Paterno: " + alumno.getApellidoPaterno());
                    System.out.println("Ap Materno: " + alumno.getApellidoMaterno());
                    System.out.println("Email: " + alumno.getEmail());
                }
            } else {
                System.out.println("EMPTY.");
            }
        } else {
            System.out.println("NULL.");
        }
        
        //Respuesta al cliente
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            System.out.println("Respondiendo al cliente.");
            JsonObjectBuilder messageBuilder = Json.createObjectBuilder();
            JsonArrayBuilder arrayAlumnosBuilder = Json.createArrayBuilder();
            if (alumnos == null) 
                messageBuilder.add("status", "null");
            else {
                if (alumnos.isEmpty()) 
                    messageBuilder.add("status", "empty");
                else {
                    alumnos.stream().map((alumno) -> {
                        JsonObjectBuilder atributosAlumnosBuilder
                                = Json.createObjectBuilder();
                        atributosAlumnosBuilder
                                .add("matricula", alumno.getMatricula())
                                .add("nombreAlumno", alumno.getNombre())
                                .add("apPaterno", alumno.getApellidoPaterno())
                                .add("apMaterno", alumno.getApellidoMaterno())
                                .add("email", alumno.getEmail());
                        return atributosAlumnosBuilder;
                    }).forEach((atributosAlumnosBuilder) -> {
                        arrayAlumnosBuilder.add(atributosAlumnosBuilder);
                    });
                    messageBuilder.add("status", "full");
                }
                messageBuilder
                    .add("listaAlumnosInscritos", arrayAlumnosBuilder);
            }
            response.setHeader(
                "server-response-header", 
                "success");
            out.print(messageBuilder.build());
            out.flush();
        } catch (IOException ex) {
            System.err.println("Mensaje error:" + ex.getMessage());
        }
    }
    
    private void getTodasCarreras(HttpServletRequest request, 
            HttpServletResponse response) {
        List<Carrera> carreras;
        try {
            System.out.println("Conectandose al servidor.");
            carreras = carreraService.readAll();
            System.out.println("Carreras obtenidas...");
        } catch (Exception ex) {
            response.setHeader(
                "server-response-header", 
                "error");
            return;
        }
        
        carreras.stream().forEach((carrera) -> {
            System.out.println(carrera.getNombre() + "-" + carrera.getStatus());
        });
        
        //Respuesta al servidor
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            System.out.println("Respondiendo al cliente.");
            JsonObjectBuilder messageBuilder = Json.createObjectBuilder();
            JsonArrayBuilder arrayCarrerasBuilder = Json.createArrayBuilder();
            if (carreras == null) 
                messageBuilder.add("status", "null");
            else {
                if (carreras.isEmpty()) 
                    messageBuilder.add("status", "empty");
                else {
                    carreras.stream().map((carrera) -> {
                        JsonObjectBuilder atributosProfesoresBuilder
                                = Json.createObjectBuilder();
                        atributosProfesoresBuilder
                                .add("IdCarrera", carrera.getIdCarrera())
                                .add("nombreCarrera", carrera.getNombre())
                                .add("status", carrera.getStatus());
                        return atributosProfesoresBuilder;
                    }).forEach((atributosProfesoresBuilder) -> {
                        arrayCarrerasBuilder.add(atributosProfesoresBuilder);
                    });
                    messageBuilder.add("status", "full");
                }
                messageBuilder
                    .add("listaCarreras", arrayCarrerasBuilder);
            }
            response.setHeader(
                "server-response-header", 
                "success");
            out.print(messageBuilder.build());
            out.flush();
        } catch (IOException ex) {
            System.err.println("Mensaje error:" + ex.getMessage());
        }
    }

    private void sendToCarreraSelected(
        HttpServletRequest request, HttpServletResponse response) 
            throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        Carrera carrera = 
            new Carrera(Integer.parseInt(request.getParameter("id")));
        try {
            carrera = carreraService.read(carrera);
            response.setHeader(
            "ver-carrera-redirect", 
            "info_carreras.jsp?id=" + carrera.getIdCarrera() + 
                    "&name=" + carrera.getNombre() + 
                    "&status=" + carrera.getStatus() + 
                    "&desc=" + carrera.getDescripcion()
            );
        } catch (Exception e) {
            response.setHeader(
                "redirection-edit-error", null
            );
        }
    }

    private void sendToEditCarrera(
        HttpServletRequest request, HttpServletResponse response) 
            throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        Carrera carrera = 
            new Carrera(Integer.parseInt(request.getParameter("id")));
        try {
            carrera = carreraService.read(carrera);
            response.setHeader(
                "edit-carrera-redirect", 
                "editar_carrera.jsp?id=" + carrera.getIdCarrera() + 
                    "&name=" + carrera.getNombre() + 
                    "&status=" + carrera.getStatus() + 
                    "&desc=" + carrera.getDescripcion()
            );
        } catch (Exception e) {
            response.setHeader(
                "redirection-edit-error", null
            );
        }
    }
    
    private void metodo() {
        System.out.println("HOLA MUNDO!");
        System.out.println("HOLA MUNDO!");
        System.out.println("HOLA MUNDO!");
        System.out.println("HOLA MUNDO!");
        System.out.println("HOLA MUNDO!");
        System.out.println("HOLA MUNDO!");
        System.out.println("HOLA MUNDO!");
        System.out.println("HOLA MUNDO!");
        System.out.println("HOLA MUNDO!");
        System.out.println("HOLA MUNDO!");
        System.out.println("HOLA MUNDO!");
    }
    
}
