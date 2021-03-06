package com.github.maxopoly.angeliacore.connection.play.packets.out;

import com.github.maxopoly.angeliacore.binary.WriteOnlyPacket;

import java.io.IOException;

public class ClientStatusPacket extends WriteOnlyPacket {

	/**
	 * Sent when the client is ready to complete login, when the client is ready to respawn after death or to request
	 * specific info
	 * 
	 * @param action
	 *          0 = Perform respawn, 1 = Request stats, 2 = open inventory
	 */
	public ClientStatusPacket(int action) throws IOException {
		super(0x03);
		writeVarInt(action);
	}

}
