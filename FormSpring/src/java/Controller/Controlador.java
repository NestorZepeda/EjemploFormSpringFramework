/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Conexion;
import Entidad.Venta;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Nestor
 */
@Controller
public class Controlador  {
    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    int id;
    List datos;
    
    @RequestMapping("index.htm")
    public ModelAndView Listar()
    {
        String sql = "Select * from venta order by id_producto";
        datos= this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("index");
        return mav;
    
    }
    @RequestMapping(value="agregar.htm",method = RequestMethod.GET)
    public ModelAndView Agregar()
    {
        mav.addObject(new Venta());
        mav.setViewName("agregar");
        return mav;
    
    }
    @RequestMapping(value="agregar.htm",method = RequestMethod.POST)
    public ModelAndView Agregar(Venta venta)
    {
        String sql = "INSERT INTO venta(producto,cantidad,precio,total) values (?,?,?,?)";
        this.jdbcTemplate.update(sql, venta.getProducto(),venta.getCantidad(),
                                 venta.getPrecio(),venta.getTotal());
        return new ModelAndView("redirect://index.htm");
    
    }
    
     @RequestMapping(value="actualizar.htm",method = RequestMethod.GET)
    public ModelAndView Actualizar(HttpServletRequest request)
    {
        id= Integer.parseInt(request.getParameter("id"));
        String sql ="select * from venta where id_producto="+id;
        datos= this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("actualizar");
        return mav;
    }
     @RequestMapping(value="actualizar.htm",method = RequestMethod.POST)
    public ModelAndView Actualizar(Venta venta)
    {
         String sql = "update venta set producto=?, cantidad=?, precio=?, total=? where id_producto="+id;
        this.jdbcTemplate.update(sql, venta.getProducto(),venta.getCantidad(),
                                 venta.getPrecio(),venta.getTotal());
        return new ModelAndView("redirect://index.htm");
    
    }
    
    @RequestMapping(value="delete.htm")
    public ModelAndView Delete(HttpServletRequest request)
    {
       id= Integer.parseInt(request.getParameter("id"));
       String sql ="delete from venta where id_producto="+id;
       this.jdbcTemplate.update(sql);
       return new ModelAndView("redirect://index.htm");
    }
}
