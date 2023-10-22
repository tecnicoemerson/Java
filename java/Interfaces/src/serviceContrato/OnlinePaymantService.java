package serviceContrato;

public interface OnlinePaymantService {

	public Double paymentFee(Double amount);

	public Double interest(Double amount, Integer months);
}
