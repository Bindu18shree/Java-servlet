package com.xworkz.apachepoi.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "app_info")
public class AppEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appId;
    private String appName;
    private int appVersion;
    private String createdDate;
    private String createdBy;

}
