package state_pattern;

class StatePatternMain {
    public static void main(String[] args) {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.setState(new Vibrate());
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
    }
}

/*
you've got a notification!
bzz bzz
...
 */
