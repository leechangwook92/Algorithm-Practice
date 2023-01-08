package Al;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Al5 {
    public static void main(String[] args) throws ScriptException {
        Al5 a1 = new Al5();
        int solution = a1.solution("3 + 4");
        System.out.println(solution);

    }
    public int solution(String my_string) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        return (int) engine.eval(my_string);
    }
}
