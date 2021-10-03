package mainn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {
    EmailService Emailservice;

    @BeforeEach
    void setup(){
        this.Emailservice = EmailService.getInstance();
    }
    @Test
    void should_ReturnTrue_When_InstanceCreated() {
        assertTrue(Emailservice instanceof EmailService);
    }

    @Test
    void should_ReturnTrue_When_MailSent() {
        //given
        Order order = new Order();
        //then
        assertThrows(RuntimeException.class,() -> Emailservice.sendEmail(order));

    }

    @Test
    void should_ReturnTrue_When_MailWithCcSent() {
        //given
        Order order = new Order();
        String cc="aj@gmail.com";
        assertTrue(Emailservice.sendEmail(order,cc));

        //then
    }
}