package state_pattern;

class SoundOn implements MobileAlertSetting {
  @Override
  public void alert(AlertStateContext ctx) {
       System.out.println("you've got a notification!");
  }
}
