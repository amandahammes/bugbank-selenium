package Framework.Utils;

import com.github.javafaker.Faker;

import java.util.Random;

public class DataGenerator {
    private Faker faker;

    public DataGenerator() {
        this.faker = new Faker();
    }

    public String generateName() {
        return faker.name().fullName();
    }

    public String generateEmail() {
        return faker.internet().emailAddress();
    }

    public String generatePassword() {
        return faker.internet().password();
    }
    public int generateTransferValue() {
        Random random = new Random();
        int transferValue = random.nextInt(500) + 10;
        return transferValue;
    }
}