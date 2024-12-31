package com.izeye.helloworld.springbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person person) {
        String firstName = person.firstName().toUpperCase();
        String lastName = person.lastName().toUpperCase();

        Person transformedPerson = new Person(firstName, lastName);
        log.info("Converting ({}) into ({})", person, transformedPerson);
        return transformedPerson;
    }

}
