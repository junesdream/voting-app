/*
package com.example.votingapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String question;

    @OneToMany(mappedBy = "poll", cascade = CascadeType.ALL)
    private List<Option> optionList;

    public void SetOptionList(List<Option> optionList) {
    }
}
*/

package com.example.votingapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String question;

    @OneToMany(mappedBy = "poll", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Option> optionList = new ArrayList<>();

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void SetOptionList(List<Option> optionList) {
    }
}