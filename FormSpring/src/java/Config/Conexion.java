/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Nestor
 */
public class Conexion 
{
    public DriverManagerDataSource Conectar()
    {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("org.postgresql.Driver");
        datasource.setUrl("jdbc:postgresql://localhost:5434/Ventas");
        datasource.setUsername("postgres");
        datasource.setPassword("Nestor2709");
        return datasource;
    }
    
}
