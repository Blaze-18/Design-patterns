package builder;

import handlers.*;

public class ChainBuilder {
    private Teller teller = new Teller();
    private Supervisor supervisor = new Supervisor();
    private BranchManager branchManager = new BranchManager();
    private RegionalManager regionalManager = new RegionalManager();

    public Handler buildChain(){

        teller.setNext(supervisor);
        supervisor.setNext(branchManager);
        branchManager.setNext(regionalManager);

        return teller;
    }
}
