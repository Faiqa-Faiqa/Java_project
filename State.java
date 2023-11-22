package State;

import Builder.Agreement;

public abstract  class State {
    public abstract void changeState(Agreement agreement);
}
