package com.sunknowledge.dme.rcm.dto.claims;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddSecondaryForPrimaryDTO {

	private Long soId;
	private String claimControlNumber;
	private String secondaryInvoiceNo;
	private Long secondaryInvoiceId;
	private boolean reslt;

}
