package main;

public class Auto implements IEstadoAuto {
  
  private IEstadoAuto autoEncendio;
  private IEstadoAuto autoMovimiento;
  private IEstadoAuto autoApagado;
  
  IEstadoAuto estadoActual;
  
  public Auto() {
    this.autoEncendio = new AutoEncender(this);
    this.autoApagado = new AutoApagar(this);
    this.autoMovimiento = new AutoManejar(this);
    
    this.estadoActual = this.autoApagado;
  }
  
  public void encender() {
    this.estadoActual.encender();
  }
  
  public void manejar() {
    this.estadoActual.manejar();
  }
  
  public void apagar() {
    this.estadoActual.apagar();
  }

  public IEstadoAuto getAutoEncendio() {
    return autoEncendio;
  }

  public void setAutoEncendio(IEstadoAuto autoEncendio) {
    this.autoEncendio = autoEncendio;
  }

  public IEstadoAuto getAutoMovimiento() {
    return autoMovimiento;
  }

  public void setAutoMovimiento(IEstadoAuto autoMovimiento) {
    this.autoMovimiento = autoMovimiento;
  }

  public IEstadoAuto getAutoApagado() {
    return autoApagado;
  }

  public void setAutoApagado(IEstadoAuto autoApagado) {
    this.autoApagado = autoApagado;
  }

  public IEstadoAuto getEstadoActual() {
    return estadoActual;
  }

  public void setEstadoActual(IEstadoAuto estadoActual) {
    this.estadoActual = estadoActual;
  }
  
}
