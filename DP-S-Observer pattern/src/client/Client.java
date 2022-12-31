package client;

import observer.MyTopicSubscriber;
import observer.Observer;
import subject.MyTopic;

public class Client {
	public static void main(String[] args) {
		MyTopic topic = new MyTopic();
		
		//create observers
		Observer observer1 = new MyTopicSubscriber("observer1");
		Observer observer2 = new MyTopicSubscriber("observer2");
		Observer observer3 = new MyTopicSubscriber("observer3");
		Observer observer4 = new MyTopicSubscriber("observer4");
		
		topic.attach(observer1);
		topic.attach(observer2);
		topic.attach(observer3);
		topic.attach(observer4);
		
		observer1.setSubject(topic);
		observer2.setSubject(topic);
		observer3.setSubject(topic);
		observer4.setSubject(topic);
		
		observer1.update();
		
		//trigger update, notifyAll call
		topic.postMessage("Lets trigger notifications");
	}
}
