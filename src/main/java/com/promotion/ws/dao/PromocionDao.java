package com.promotion.ws.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.promotion.ws.utilidades.PromocionUtilidades;
import com.promotion.ws.vo.PromocionVo;

@Service
public class PromocionDao {
	
	
//IniciarLista
	public PromocionDao() {
		PromocionUtilidades.IniciarLista();
	}

	
//Consultar Lista
	public PromocionVo consultarPromocionIndividual(String id_username) {
		// TODO Auto-generated method stub
		PromocionVo promocionVo=null;
		for (PromocionVo p : PromocionUtilidades.listaPromocion) {
			if(p.getId_username().equals(id_username)) {
				promocionVo=new PromocionVo();
				promocionVo.setId_username(p.getId_username());
				promocionVo.setTypeFormat(p.getTypeFormat());
				promocionVo.setDuration(p.getDuration());
				promocionVo.setEmail(p.getEmail());
				promocionVo.setDate(p.getDate());
				
			}
		}
		return promocionVo;
	}
	
	
//Obtener Lista
	public List<PromocionVo> obtenerListaPromocion(){
		return PromocionUtilidades.listaPromocion;
	}
	
	
//Registrar Promocion
	public PromocionVo registrarPromocion(PromocionVo promocionVo) {
		boolean existe=false;
		
		for (PromocionVo obj : PromocionUtilidades.listaPromocion) {
			if (obj.getId_username().equals(promocionVo.getId_username())) {
				existe=true;
				break;
			}
		}
		if (existe==false) {
			PromocionUtilidades.listaPromocion.add(promocionVo);
			return promocionVo;
		} else {
			return null;

		}
	}
	
	
//Actualizar promocion
	public PromocionVo actualizarPromocion(PromocionVo promocion) {
		PromocionVo promocionVo=null;
		for (PromocionVo obj : PromocionUtilidades.listaPromocion) {
			if (obj.getId_username().equals(promocion.getId_username())) {
				obj.setId_username(promocion.getId_username());
				obj.setTypeFormat(promocion.getTypeFormat());
				obj.setDuration(promocion.getDuration());
				obj.setEmail(promocion.getEmail());
				obj.setDate(promocion.getDate());
				promocionVo=obj;
				break;
			}
		}
		return promocionVo;
	}

	
//eliminar Promocion
	public void eliminarPromocion(PromocionVo promocion) {
		for (PromocionVo obj : PromocionUtilidades.listaPromocion) {
			PromocionUtilidades.listaPromocion.remove(obj);
			break;
		}
	}
}
