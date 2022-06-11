package com.promotion.ws.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.promotion.ws.dao.PromocionDao;
import com.promotion.ws.vo.PromocionVo;

@RestController
@RequestMapping("/servicio")
public class PromocionService {

	@Autowired(required=true)
	private PromocionDao promocionDao;
	
	@GetMapping("Prueba")
	public String prueba() {
		return "Esto es un prueba de barberShop";
	}
	
	

	
	
	//http://localhost:8080/servicio/promocion/11
	@GetMapping("promocion/{id}")
	public ResponseEntity<PromocionVo> getPromocion(@PathVariable("id") String id_username){
		
		PromocionVo promocion=promocionDao.consultarPromocionIndividual(id_username);
		
		if(promocion!=null) {
			//promocion=new PromocionVo();
			return ResponseEntity.ok(promocion);
		}
		
		return ResponseEntity.notFound().build();
		
	}
	
	
	//http://localhost:8080/servicio/promocion-list
	@GetMapping("promocion-list")
	public ResponseEntity<List<PromocionVo>> getPromocion(){
		
		List<PromocionVo> promocion=promocionDao.obtenerListaPromocion();
		
		return ResponseEntity.ok(promocion);
		
	}
	
	
	//http://localhost:8080/servicio/guardar
	@PostMapping("guardar")
	public ResponseEntity<PromocionVo> registrarPromocion(@RequestBody PromocionVo promocion){
		
		PromocionVo miPromocion=promocionDao.registrarPromocion(promocion);
		
		if (miPromocion!=null) {
			return ResponseEntity.ok(miPromocion);
		} else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	
	//http://localhost:8080/servicio/actualizar
	@PutMapping("actualizar")
	public ResponseEntity<PromocionVo> actualizarPromocion(@RequestBody PromocionVo promocion) {
		
		PromocionVo miPromocion=null;
		if (promocionDao.consultarPromocionIndividual(promocion.getId_username())!=null) {
			miPromocion=promocionDao.actualizarPromocion(promocion);
			if (miPromocion!=null) {
				return ResponseEntity.ok(miPromocion);
			}else {
				return ResponseEntity.notFound().build();
			}
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	//http://localhost:8080/servicio/eliminar/22
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<Void> eliminarPromocion(@PathVariable String id){
		PromocionVo miPromocion=promocionDao.consultarPromocionIndividual(id);
		if (miPromocion!=null) {
			promocionDao.eliminarPromocion(miPromocion);
			return ResponseEntity.ok(null);
		}
		
		return ResponseEntity.notFound().build();
	}
}
