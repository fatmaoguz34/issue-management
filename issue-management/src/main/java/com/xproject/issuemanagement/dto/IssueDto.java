package com.xproject.issuemanagement.dto;

import com.xproject.issuemanagement.entity.IssueStatus;
import com.xproject.issuemanagement.entity.Project;
import lombok.Data;

import java.util.Date;

@Data
public class IssueDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;

}
