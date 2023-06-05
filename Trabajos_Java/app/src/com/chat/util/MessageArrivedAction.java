package com.chat.util;

import com.chat.domain.Mensaje;

public interface MessageArrivedAction {
	
	public void messageArrived(String topic, Mensaje message);

}
