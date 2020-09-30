package com.xproject.issuemanagement.service;

import com.xproject.issuemanagement.TPage;
import com.xproject.issuemanagement.dto.IssueDto;
import com.xproject.issuemanagement.entity.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {
    IssueDto save(IssueDto issue);
    IssueDto getById(Long id);
    TPage<IssueDto> getAllPageable(Pageable pageable);
    Boolean delete(IssueDto issue);
}

