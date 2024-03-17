import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.suptech.dao.PersonDao;
import org.suptech.entities.Person;
import org.suptech.util.HibernateUtil;

public class HibernateTest {

    @Test
    public void init_db() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Assert.assertNotNull(factory);
    }

    @Test
    public void add_person() {
        PersonDao dao = new PersonDao();
        Person person = new Person("John", "Dao", 42);
        Person person_result = dao.addPerson(person);
        Assert.assertEquals(person.getName(), person_result.getName());
    }
}
