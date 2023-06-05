public class ServiceStation {

    public void changeTyre(Transport transport) {
        if (transport instanceof TyreChangeable) {
            TyreChangeable tyreChangeableTransport = (TyreChangeable) transport;
            for (int i = 0; i < transport.getTyreCount(); i++) {
                tyreChangeableTransport.changeTyre();
            }
        }
    }


    public void checkEngine(Transport transport) {
        if (transport instanceof EngineCheckable) {
            EngineCheckable engineCheckableTransport = (EngineCheckable) transport;

                engineCheckableTransport.checkEngine();

        }
    }

    public void checkTrailer(Transport transport) {
        if (transport instanceof TrailerCheckable) {
            TrailerCheckable trailerCheckableTransport = (TrailerCheckable) transport;
            trailerCheckableTransport.checkTrailer();
        }

    }


}
