package net.minecraft.server;

import java.io.IOException;

public class PacketLoginOutSetCompression implements Packet<PacketLoginOutListener> {

    private int a;

    public PacketLoginOutSetCompression() {}

    public PacketLoginOutSetCompression(int i) {
        this.a = i;
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
        this.a = packetdataserializer.g();
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
        packetdataserializer.d(this.a);
    }

    public void a(PacketLoginOutListener packetloginoutlistener) {
        packetloginoutlistener.a(this);
    }
}
