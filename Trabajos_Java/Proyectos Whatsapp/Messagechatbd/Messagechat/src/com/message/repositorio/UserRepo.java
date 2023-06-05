package com.message.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Usuario;

public class UserRepo {

private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public UserRepo() {
		usuarios.add(new Usuario(1, "Josue", "Bones", "josue91", "https://scontent.fgye14-1.fna.fbcdn.net/v/t39.30808-6/315937021_5494316557352918_8252423983560167128_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeE7mZrNU9Hlj6No0uZw7gqnVCT77_6BM3NUJPvv_oEzc3WECS4dp2sEtTFSFJvEN-eunTURLdstC6ZXAOHbcfGt&_nc_ohc=5E9OTWCRtv4AX_lDDv-&_nc_ht=scontent.fgye14-1.fna&oh=00_AfAX7agbxL1si2SqUzD8RVJyFn-1gqVOfZcK4Mewy3AiZg&oe=63F02B56",
				"josue91", "En linea"));
		usuarios.add(new Usuario(2, "Genesis", "Vernaza", "genesis01", "https://scontent.fgye14-1.fna.fbcdn.net/v/t39.30808-6/316812943_3430502767195878_8632146638786766033_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeEM_PV6pguimL6dWyB_vdV5HZnEsePivp0dmcSx4-K-nQnSaJOnRn6LGXOW_yU_lK0fSYdILP29txRsJe5ib8cz&_nc_ohc=cBg2zx10rq0AX9AfXEg&_nc_ht=scontent.fgye14-1.fna&oh=00_AfDeOku_i1ovdqTgycHMqgKdjVyWwJqDlI5z0v7D6HornA&oe=63EFF9DC", 
				"vernaza123", "En linea"));
		usuarios.add(new Usuario(3, "Lady", "Toala", "lady23", "https://pps.whatsapp.net/v/t61.24694-24/231501093_1121345211993227_49501755574987434_n.jpg?ccb=11-4&oh=01_AdSWeRxrz0lGY08ThH2xKK3DEUEc1t7DMxvZKpw8qhw3Tg&oe=63F7E579", 
				"toala123", "Desconectado"));
		usuarios.add(new Usuario(4, "Gabriela", "Santana", "gaby02", "https://pps.whatsapp.net/v/t61.24694-24/324666986_918928409280406_6197423910438754934_n.jpg?ccb=11-4&oh=01_AdRzeyqyeUkPjPJMVQgo8osHUiLg1HHzz_PGYFkWvYHTpg&oe=63F7C8D5", 
				"santana123", "En linea"));
		usuarios.add(new Usuario(5, "Juan", "Altamirano", "juan10", "https://pps.whatsapp.net/v/t61.24694-24/315800932_101482442842100_7988931221190740832_n.jpg?ccb=11-4&oh=01_AdRzf5Qdl2IMLmcCqqVqN19Td3JBaIBSZ0vX-3GR4jkDxQ&oe=63F7E4FF",
				"j1234", "Desconectado"));
		usuarios.add(new Usuario(6, "Nathan", "Sani", "nathan98", "https://scontent.fgye14-1.fna.fbcdn.net/v/t39.30808-6/327007948_1655359338252786_1301525010683242909_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=e3f864&_nc_eui2=AeGfeBlotg7RRogYGhAGn8kehAaJPddQmluEBok911CaW5sYmEShTNcYUnay3OFD4CmfDCQsSnc3jcLLJ62UzSmP&_nc_ohc=2cmFc6NoAB0AX_kF9va&_nc_ht=scontent.fgye14-1.fna&oh=00_AfATkMZGyXQkhrzhDLRhELBF7jGUWkaFmHN7C1HQuiZ8Vg&oe=63EF7D5A",
				"sani1234", "Desconectado"));
		usuarios.add(new Usuario(7, "Erick", "Mendoza", "erick95", "https://pps.whatsapp.net/v/t61.24694-24/317725850_756214042105671_8953613004140520262_n.jpg?ccb=11-4&oh=01_AdS1n-dZUGSPTLQ9zGNNYl-Vd-XN8jg4XdFtUY6jD3QYxg&oe=63F7C454",
				"mendoza1234", "En linea"));
		usuarios.add(new Usuario(8, "Karen", "Gonzalez", "karen96", "https://scontent.fgye14-1.fna.fbcdn.net/v/t1.6435-9/100515711_2747341268710889_7298280704519962624_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeHjqJPCzys3VoPvLU9EZAO0sxPLNbCbv_6zE8s1sJu__g4kBamWbwsmQ8P6I7KkyHFluoYQtSuui6L5qAVHDY5U&_nc_ohc=-8UI_GxyPJcAX_soRHe&tn=XYUTnS039Tpb6oJ2&_nc_ht=scontent.fgye14-1.fna&oh=00_AfAt9vpe0b64roie-bH7gI2Angnpf5ncyTjjfMcVWpj3iQ&oe=64123A6D", 
				"k1234", "En linea"));
		usuarios.add(new Usuario(9, "Susana", "Holguin", "susana01", "https://scontent.fgye14-1.fna.fbcdn.net/v/t39.30808-6/220257737_4151190711584906_9181481498678302831_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeFBkF1omF3SVFbWvchkFDPCKb4G-lAjKNIpvgb6UCMo0ka3ElwVci2v54LxT_kjxd0gdclBK8aKdc1mC365FOaY&_nc_ohc=EkSs3ylgSqMAX-0QgEs&_nc_ht=scontent.fgye14-1.fna&oh=00_AfBafXLfa9mDkvGSiViUqkg_f4rq1wfENzDJ9o2KpgLvMw&oe=63F0B9F3", 
				"s1234", "Desconectado"));
		usuarios.add(new Usuario(10, "Luis", "Vivanco", "luis98", "https://scontent.fgye14-1.fna.fbcdn.net/v/t39.30808-6/293938812_953182818991403_1816248161126211444_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeEuGyFT4owlYwzAxDOY1Xvgl4Ju4Mnd8WKXgm7gyd3xYmQfaRBT7T7gnf8c5FjTSZSQ8B87HJUFLY5m0cxxDbtF&_nc_ohc=_DXjT5My6GUAX8sQ7U-&tn=XYUTnS039Tpb6oJ2&_nc_ht=scontent.fgye14-1.fna&oh=00_AfAmbbQTQfjeONtZeHXnRLnT-6K_ic7aVoBbuHPA2I14IA&oe=63EFC451",
				"l1234", "Desconectado"));
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public Usuario userId(int id) {
		for(Usuario user: usuarios) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}
	
	public Usuario userName(String username) {
		for(Usuario user: usuarios) {
			if(user.getUsername().equals(username))
				return user;
		}
		return null;
	}
	
	public Usuario password(String username, String clave) {
		for(Usuario user: usuarios) {
			if(user.getUsername().equals(username) && user.getClave().equals(clave))
				return user;
		}
		return null;
	}
	
}
