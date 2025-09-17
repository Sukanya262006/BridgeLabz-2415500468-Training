class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.1; }
    @Override public double calculateTax() { return getPrice() * 0.18; }
    @Override public String getTaxDetails() { return "18% GST"; }
}