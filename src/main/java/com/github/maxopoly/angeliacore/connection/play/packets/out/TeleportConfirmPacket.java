package com.github.maxopoly.angeliacore.connection.play.packets.out;

import com.github.maxopoly.angeliacore.binary.WriteOnlyPacket;

import java.io.IOException;

public class TeleportConfirmPacket extends WriteOnlyPacket {

	public TeleportConfirmPacket(int teleportID) throws IOException {
		super(0x00);
		writeVarInt(teleportID);
	}

}
