package com.zzd.idea_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
@Scope
public class IdeaGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdeaGitApplication.class, args);
    }

}
