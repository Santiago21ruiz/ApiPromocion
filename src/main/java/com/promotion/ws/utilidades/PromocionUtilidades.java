package com.promotion.ws.utilidades;

import java.util.ArrayList;
import java.util.List;

import com.promotion.ws.vo.PromocionVo;

public class PromocionUtilidades {
	public final static int promocion1=1;
	static int promocion=0;
	
	public static List<PromocionVo> listaPromocion=new ArrayList<PromocionVo>();
	
	public static void IniciarLista() {
		if(promocion==0) {
			listaPromocion.add(new PromocionVo("11",".png","2 dias","barberoandre@gmail.com","10/06/2022"));
			listaPromocion.add(new PromocionVo("22",".jpg","2 dias","barberoCamilo@gmail.com","16/07/2022"));
			listaPromocion.add(new PromocionVo("33",".jpg","10 dias","barberoSantiago@gmail.com","20/05/2022"));
			listaPromocion.add(new PromocionVo("44",".jpg","1 dia","barberoBrayan@gmail.com","01/08/2022"));
			promocion=1;
		}
	}
	
}
