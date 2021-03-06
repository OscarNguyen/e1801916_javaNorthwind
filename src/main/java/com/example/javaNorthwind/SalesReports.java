package com.example.javaNorthwind;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.example.javaNorthwind.SalesReports")
@Table(name = "sales_reports")
public class SalesReports {

  @Id
  @Column(name = "\"group_by\"", nullable = false)
  private String groupBy;
  @Column(name = "\"display\"", nullable = true)
  private String display;
  @Column(name = "\"title\"", nullable = true)
  private String title;
  @Column(name = "\"filter_row_source\"", nullable = true)
  private String filterRowSource;
  @Column(name = "\"default1\"", nullable = false)
  private boolean default1;
}