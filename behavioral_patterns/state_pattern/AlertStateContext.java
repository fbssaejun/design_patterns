package state_pattern;

class AlertStateContext {
  private MobileAlertSetting currentState;

  public AlertStateContext() {
      currentState = new SoundOn();
  }

  public void setState(MobileAlertSetting state) {
      currentState = state;
  }

  public void alert() {
      currentState.alert(this);
  }
}
