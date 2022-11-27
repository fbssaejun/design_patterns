package observer_pattern;

public class ObserverPatternMain {

	public static void main(String[] args) {
		//create subject
		MyTopic topic = new MyTopic();

		//create observers
		Observer obj1 = new MyTopicSubscriber("Obj1");
		Observer obj2 = new MyTopicSubscriber("Obj2");
		Observer obj3 = new MyTopicSubscriber("Obj3");

		//register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);

		//now send message to subject
		topic.postMessage("New Message: Lots of snow in Toronto this week");
	}
}

/*
Message Posted to Topic: New Message: Lots of snow in Toronto this week
Obj1:: Consuming message::New Message: Lots of snow in Toronto this week
Obj2:: Consuming message::New Message: Lots of snow in Toronto this week
Obj3:: Consuming message::New Message: Lots of snow in Toronto this week
 */
