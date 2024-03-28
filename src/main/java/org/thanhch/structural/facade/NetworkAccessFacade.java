package org.thanhch.structural.facade;

/**
 * @author thanhch
 * <p>
 * Date: 29/03/2024
 * <p>
 * Class: NetworkAccessFacade
 */
public class NetworkAccessFacade {
    private Comm comm = new Comm();
    private Cache cache = new Cache();
    private Converter converter = new Converter();
    private Interceptor interceptor = new Interceptor();

    public void communicate() {
        cache.cache();
        comm.send("data");
        comm.receive("response");
        interceptor.intercept();
        converter.convert();
    }
}
