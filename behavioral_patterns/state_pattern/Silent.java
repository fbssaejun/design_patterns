package state_pattern;

class Silent implements MobileAlertSetting {
  @Override
  public void alert(AlertStateContext ctx) {
      System.out.println("...");
  }
}
