package serviceContrato;

import java.time.LocalDate;

import entitiesContrato.Contract;
import entitiesContrato.Installment;

public class ContractService {
	
	private OnlinePaymantService online;

	public ContractService(OnlinePaymantService online) {
		this.online = online;
	}

	public void processContract(Contract contract, Integer months) {

		double basicQuota = contract.getTotalValue()/months;
		
		for(int i=1;i<= months;i++){
			LocalDate dueDate = contract.getDate().plusMonths(i);

			double interest = online.interest(basicQuota, i);
			double fee = online.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate,quota));
		
		}
		
	}
	
}
