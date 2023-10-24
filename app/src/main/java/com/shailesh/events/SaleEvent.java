package com.shailesh.events;

import lombok.Data;

@Data
public class SaleEvent {
  private String product;
  private Long value;
}
