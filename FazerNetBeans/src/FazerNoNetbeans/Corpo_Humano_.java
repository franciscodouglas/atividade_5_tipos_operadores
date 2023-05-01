
package FazerNoNetbeans;

public class Corpo_Humano_
{
    private float massa;
    private float densidade;
    private float volume;
    private double altura;
 
    public Corpo_Humano_(float massa, float volume, double altura)
    {
        this.massa = massa;
        this.volume = volume;
        this.altura = altura;
        densidade = massa / volume;
    }
  
    public float GetMassa()
    {
        return massa;
    }
    public float GetVolume()
    {
        return volume;
    }
    public float GetDensidade()
    {
        return densidade;
    }
  
  	public void SetMassa(float massa)
	{
      this.massa = massa;
      densidade = massa / volume;
	}
    public void SetVolume(float volume)
    {
        this.volume = volume;
        densidade = massa / volume;
    }

    public double calcularIMC(){
        return massa/(altura*altura);
    }
}