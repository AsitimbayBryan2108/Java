package com.message.repositorio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Mensaje;
import com.message.dominio.Usuario;

public class MessageRepo {
	
	private List<Mensaje> mensajes = new ArrayList<Mensaje>();
	private UserRepo usuario = new UserRepo();
	
	public MessageRepo() {
		Usuario josue = usuario.userId(1);
		Usuario genesis = usuario.userId(2);
		Usuario lady = usuario.userId(3);
		Usuario gabriela = usuario.userId(4);
		Usuario juan = usuario.userId(5);
		Usuario nathan = usuario.userId(6);
		Usuario erick = usuario.userId(7);
		Usuario karen = usuario.userId(8);
		Usuario susana = usuario.userId(9);
		Usuario luis = usuario.userId(10);
		
		//CONVERSACIONES DE JOSUE//
		mensajes.add(new Mensaje(1, genesis, josue, LocalDateTime.of(2023, 01, 16, 12, 30), "Hola ñaño como estas"));
		mensajes.add(new Mensaje(2, josue, genesis, LocalDateTime.of(2023, 01, 16, 12, 31), "Hola comdrita bien y tu como has estado"));
		
		mensajes.add(new Mensaje(1, genesis, josue, LocalDateTime.of(2023, 01, 16, 12, 32), "bien bien oye como vas con programacion"));
		mensajes.add(new Mensaje(2, josue, genesis, LocalDateTime.of(2023, 01, 16, 12, 35), "ya me falta poko"));
		
		mensajes.add(new Mensaje(3, lady, josue, LocalDateTime.of(2023, 01, 16, 12, 20), "Oye cierto que el viernes hay un evento en la facultdad"));
		mensajes.add(new Mensaje(4, josue, lady, LocalDateTime.of(2023, 01, 16, 12, 30), "Sii es a las 10 es obligatorio ir"));
		
		mensajes.add(new Mensaje(3, lady,josue, LocalDateTime.of(2023, 01, 16, 12, 32), "yo ni por enterada =( "));
		mensajes.add(new Mensaje(4, josue, lady, LocalDateTime.of(2023, 01, 16, 12, 35), "jajaj como simpre"));
		
		mensajes.add(new Mensaje(5, josue, gabriela, LocalDateTime.of(2023, 01, 16, 11, 30), "Hola perdida"));
		mensajes.add(new Mensaje(6, gabriela, josue, LocalDateTime.of(2023, 01, 16, 11, 31), "kheee perdida yo xd"));
		
		mensajes.add(new Mensaje(5, josue, gabriela, LocalDateTime.of(2023, 01, 16, 12, 30), "como vas ya histes estadisticas"));
		mensajes.add(new Mensaje(6, gabriela, josue, LocalDateTime.of(2023, 01, 16, 12, 30), "no aun ni empiezo."));
		
		mensajes.add(new Mensaje(7, juan, josue, LocalDateTime.of(2023, 01, 16, 12, 30), "Que hay bro pilas el sabado vamos a jugar futbol"));
		mensajes.add(new Mensaje(8, josue, juan, LocalDateTime.of(2023, 01, 16, 12, 30), "Ya de una confirma si van todos"));
		
		mensajes.add(new Mensaje(7, josue, juan, LocalDateTime.of(2023, 01, 16, 12, 30), "si van yo voy pilas :)"));
		mensajes.add(new Mensaje(8, juan, josue, LocalDateTime.of(2023, 01, 16, 12, 30), "listo entonces"));
		
		mensajes.add(new Mensaje(9, nathan, josue, LocalDateTime.of(2023, 01, 16, 12, 30), "Como vas con el proyecto de programacion"));
		mensajes.add(new Mensaje(10, josue, nathan, LocalDateTime.of(2023, 01, 16, 12, 30), "Ya casi lo termino esta complicado un poko jaja"));
		
		mensajes.add(new Mensaje(11, josue, erick, LocalDateTime.of(2023, 01, 16, 12, 30), "Todo bien socio confirma donde andas"));
		mensajes.add(new Mensaje(12, erick, josue, LocalDateTime.of(2023, 01, 16, 12, 30), "Aqui en caleta viendo unos videos "));
		
		mensajes.add(new Mensaje(13, karen, josue, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis bobis como estas"));
		mensajes.add(new Mensaje(14, josue, karen, LocalDateTime.of(2023, 01, 16, 12, 30), "Holaaaa mocosa bien y tu"));
		
		mensajes.add(new Mensaje(14, josue, susana, LocalDateTime.of(2023, 01, 16, 12, 30), "Hola Susy"));
		mensajes.add(new Mensaje(15, susana, josue, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(16, luis, josue, LocalDateTime.of(2023, 01, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(17, josue, luis, LocalDateTime.of(2023, 01, 16, 12, 30), "Confirma que hay pa el finde"));
		
		//CONVERSACIONES DE GENESIS//
		mensajes.add(new Mensaje(18, genesis, lady, LocalDateTime.of(2023, 01, 16, 12, 30), "Hola amiguis como te ha ido"));
		mensajes.add(new Mensaje(19, lady, genesis, LocalDateTime.of(2023, 01, 16, 12, 30), "Holiiiis bien horita me estoy haciendo las uñas"));
		
		mensajes.add(new Mensaje(18, genesis, lady, LocalDateTime.of(2023, 01, 16, 12, 30), "aza para el finde me imagino"));
		mensajes.add(new Mensaje(19, lady, genesis, LocalDateTime.of(2023, 01, 16, 12, 30), "asi es antes muerta que sencilla :p"));
		
		mensajes.add(new Mensaje(20, genesis, gabriela, LocalDateTime.of(2023, 01, 16, 12, 30), "gaby te tengo un chisme jaja"));
		mensajes.add(new Mensaje(21, gabriela, genesis, LocalDateTime.of(2022, 01, 16, 12, 30), "Aver cuenta cuenta xd"));
		
		mensajes.add(new Mensaje(20, genesis, gabriela, LocalDateTime.of(2023, 01, 16, 12, 30), "ya tengo novio"));
		mensajes.add(new Mensaje(21, gabriela, genesis, LocalDateTime.of(2023, 01, 16, 12, 30), "serio super."));
		
		mensajes.add(new Mensaje(22, juan, genesis, LocalDateTime.of(2023, 01, 06, 12, 30), "Hola guapa cuando nos vemos"));
		mensajes.add(new Mensaje(23, genesis, juan, LocalDateTime.of(2023, 01, 06, 12, 30), "el fin de semana"));
		
		mensajes.add(new Mensaje(24, nathan, genesis, LocalDateTime.of(2023, 01, 16, 12, 30), "Holiiiis ayudame en programacion :c"));
		mensajes.add(new Mensaje(25, genesis, nathan, LocalDateTime.of(2023, 11, 16, 12, 30), "jaja dime en que quieres que te ayude"));
		
		mensajes.add(new Mensaje(26, genesis, erick, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis amiwoooo como estas"));
		mensajes.add(new Mensaje(27, erick, genesis, LocalDateTime.of(2023, 01, 16, 12, 30), "Hola bien aqui trabajando y tu"));
		
		mensajes.add(new Mensaje(28, karen, genesis, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis bobita oye pasame el deber de estadistica"));
		mensajes.add(new Mensaje(29, genesis, karen, LocalDateTime.of(2023, 01, 16, 12, 30), "como que bobita ya te lo paso xd"));
		
		mensajes.add(new Mensaje(30, genesis, susana, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de lady"));
		mensajes.add(new Mensaje(31, susana, genesis, LocalDateTime.of(2023, 01, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(32, luis, genesis, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(33, genesis, luis, LocalDateTime.of(2023, 01, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE GABY//
		
		mensajes.add(new Mensaje(36, juan, gabriela, LocalDateTime.of(2023, 01, 16, 12, 30), "Hola como estas "));
		mensajes.add(new Mensaje(37, gabriela, juan, LocalDateTime.of(2023, 01, 16, 12, 30), "bien bien en casa haciendo tareas"));
		
		mensajes.add(new Mensaje(38, gabriela, nathan, LocalDateTime.of(2023, 01, 16, 12, 30), "Holiiiis ya tienes estadisticas"));
		mensajes.add(new Mensaje(39, nathan, gabriela, LocalDateTime.of(2023, 01, 16, 12, 30), "ya solo me falta un ejercicio lo termino y te comparto"));
		
		mensajes.add(new Mensaje(40, gabriela, erick, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis amiwoooo como estas"));
		mensajes.add(new Mensaje(41, erick, gabriela, LocalDateTime.of(2023, 01, 16, 12, 30), "Hola gaby bien aqui trabajando y tu"));
		
		mensajes.add(new Mensaje(42, karen, gabriela, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis bobita oye pasame el deber de estadistica"));
		mensajes.add(new Mensaje(43,  gabriela, karen, LocalDateTime.of(2023, 01, 16, 12, 30), "como que bobita ya te lo paso xd"));
		
		mensajes.add(new Mensaje(44, gabriela, susana, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de Magaly"));
		mensajes.add(new Mensaje(45, susana, gabriela, LocalDateTime.of(2023, 01, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(46, luis, gabriela, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(47, gabriela, luis, LocalDateTime.of(2023, 01, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE lady//
		mensajes.add(new Mensaje(48, juan, lady, LocalDateTime.of(2023, 01, 16, 12, 30), "oe pilas para esa fiesta "));
		mensajes.add(new Mensaje(49, lady, juan, LocalDateTime.of(2023, 01, 16, 12, 30), "sera solo de chicas "));
		
		mensajes.add(new Mensaje(48, juan, lady, LocalDateTime.of(2023, 01, 16, 12, 30), "ya dice, bueno entonces pa la proxima "));
		mensajes.add(new Mensaje(49, lady, juan, LocalDateTime.of(2023, 01, 16, 12, 30), "jejeej si hay si estas invitado "));
		
		mensajes.add(new Mensaje(50, lady, nathan, LocalDateTime.of(2023, 01, 16, 12, 30), "Holiiiis ayudame en programacion :c"));
		mensajes.add(new Mensaje(51, nathan, lady, LocalDateTime.of(2023, 01, 16, 12, 30), "jaja dime en que quieres que te ayude"));
		
		mensajes.add(new Mensaje(52, lady, erick, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis amiwoooo como estas"));
		mensajes.add(new Mensaje(53, erick, lady, LocalDateTime.of(2023, 01, 16, 12, 30), "Hola miche bien aqui trabajando y tu"));
		
		mensajes.add(new Mensaje(54, karen, lady, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis bobita oye pasame el deber de estadistica"));
		mensajes.add(new Mensaje(55, lady, karen, LocalDateTime.of(2023, 01, 16, 12, 30), "como que bobita ya te lo paso xd"));
		
		mensajes.add(new Mensaje(56, lady, susana, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de Magaly"));
		mensajes.add(new Mensaje(57, susana, lady, LocalDateTime.of(2023, 01, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(58, luis, lady, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(59, lady, luis, LocalDateTime.of(2023, 01, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE JUAN//
		mensajes.add(new Mensaje(60, juan, nathan, LocalDateTime.of(2023, 01, 16, 12, 30), "Como vas con el proyecto de programacion"));
		mensajes.add(new Mensaje(61, nathan, juan, LocalDateTime.of(2023, 01, 16, 12, 30), "Ya casi lo termino esta algo complicado jaja"));
		
		mensajes.add(new Mensaje(62, juan, erick, LocalDateTime.of(2023, 01, 16, 12, 30), "Todo bien socio confirma donde andas"));
		mensajes.add(new Mensaje(63, erick, juan, LocalDateTime.of(2023, 01, 16, 12, 30), "Aqui en caleta viendo videos"));
		
		mensajes.add(new Mensaje(64, karen, juan, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis bobis como estas"));
		mensajes.add(new Mensaje(65, juan, karen, LocalDateTime.of(2023, 01, 16, 12, 30), "Holaaaa amiga por aka bien y tu"));
		
		mensajes.add(new Mensaje(66, juan, susana, LocalDateTime.of(2023, 01, 16, 12, 30), "Hola Susy"));
		mensajes.add(new Mensaje(67, susana, juan, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(68, luis, juan, LocalDateTime.of(2023, 01, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(69, juan, luis, LocalDateTime.of(2023, 01, 16, 12, 30), "Confirma ñaño el fin de semana para el peloteo "));
		
		//CONVERSACIONES DE NATHAN//
		mensajes.add(new Mensaje(70, nathan, erick, LocalDateTime.of(2023, 01, 16, 12, 30), "Todo bien socio confirma donde andas"));
		mensajes.add(new Mensaje(71, erick, nathan, LocalDateTime.of(2023, 01, 16, 12, 30), "Aqui en caleta viendo los partidos del mundial"));
		
		mensajes.add(new Mensaje(72, karen, nathan, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis nathan como estas"));
		mensajes.add(new Mensaje(73, nathan, karen, LocalDateTime.of(2023, 01, 16, 12, 30), "Holaaaa reina hermosa como estas por aka todo bien y tu"));
		
		mensajes.add(new Mensaje(74, nathan, susana, LocalDateTime.of(2023, 01, 16, 12, 30), "Hola Susy"));
		mensajes.add(new Mensaje(75, susana, nathan, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(76, luis, nathan, LocalDateTime.of(2023, 01, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(77, nathan, luis, LocalDateTime.of(2023, 01, 16, 12, 30), "pilas para ese peloteo"));
	
		//CONVERSACIONES DE ERICK//
		mensajes.add(new Mensaje(78, karen, erick, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis erick como estas"));
		mensajes.add(new Mensaje(79, erick, karen, LocalDateTime.of(2023, 01, 16, 12, 30), "Holaaaa, bien y tu"));
		
		mensajes.add(new Mensaje(80, erick, susana, LocalDateTime.of(2023, 01, 16, 12, 30), "Hola Susy"));
		mensajes.add(new Mensaje(81, susana, erick, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(82, luis, erick, LocalDateTime.of(2023, 01, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(83, erick, luis, LocalDateTime.of(2023, 01, 16, 12, 30), "Confirma pechin"));
		
		//CONVERSACIONES DE KAREN//
		mensajes.add(new Mensaje(84, karen, susana, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de Magaly"));
		mensajes.add(new Mensaje(85, susana, karen, LocalDateTime.of(2023, 01, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(87, luis, karen, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(88, karen, luis, LocalDateTime.of(2023, 01, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE SUSANA//
		mensajes.add(new Mensaje(89, luis, susana, LocalDateTime.of(2023, 01, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(90, susana, luis, LocalDateTime.of(2023, 01, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
	}
	public List<Mensaje> getMensajes(){
		return mensajes;
	}
	
	public List<Mensaje> conversaciones(int usuario1, int usuario2) {
		List<Mensaje> resultado = new ArrayList<Mensaje>();
		for(Mensaje msj: mensajes) {
			if((msj.getUsuario1().getId() == usuario1 && msj.getUsuario2().getId() == usuario2) || (
					msj.getUsuario1().getId() == usuario2 && msj.getUsuario2().getId() == usuario1))
				resultado.add(msj);
		}
		return resultado;		
	}
	
	public Mensaje getUltimoMsj(int usuario1, int usuario2) {
		List<Mensaje> resultado = conversaciones(usuario1, usuario2);
		
		if(resultado.size() == 0)
			return null;
		return resultado.get(resultado.size()-1);		
	}
	
	public void addMensajes(Mensaje mensaje) {
		mensajes.add(mensaje);		
	}

}
