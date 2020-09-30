package com.xproject.issuemanagement.repository;

import com.xproject.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

//<Issue, Long> <interfacein hangi tabloya hizmet edeceği, o tablonun id tipi>
public interface IssueRepository extends JpaRepository<Issue, Long> {


}
