package state_pattern;

class Vibrate implements MobileAlertSetting {
  @Override
  public void alert(AlertStateContext ctx) {
      System.out.println("bzz bzz");
  }
}
