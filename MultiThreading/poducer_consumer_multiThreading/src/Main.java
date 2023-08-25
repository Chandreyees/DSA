public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        ProducerThread producer = new ProducerThread(company);
        ConsumerThread consumer = new ConsumerThread(company);
        producer.start();
        consumer.start();
    }
}