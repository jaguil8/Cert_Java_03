/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.web.holaweb.oad;

import org.springframework.data.jpa.repository.JpaRepository;
import rysi.web.holaweb.entidades.Membresia;

/**
 *
 * @author jaguilera
 */
public interface MembresiaOad extends JpaRepository<Membresia, Integer> {
    
}
