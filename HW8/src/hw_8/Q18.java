package hw_8;

class PrintException extends Exception {}
class PaperPrintException extends PrintException {}

// Interface name Printer change with Q18
public interface Q18 {

	abstract int printData() throws PrintException;
}

public int printData1() throws PaperPrintException
