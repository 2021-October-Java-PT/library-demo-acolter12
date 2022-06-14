package org.wecancodeit.librarydemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.librarydemo.models.Campus;
import org.wecancodeit.librarydemo.repositories.CampusRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private CampusRepository campusRepo;

    @Override
    public void run(String... args) throws Exception {
        Campus columbus = new Campus("Columbus");
        campusRepo.save(columbus);
    }
}
