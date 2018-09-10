import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.chance.Chance;
import org.drools.chance.factmodel.ChanceBeanBuilderImpl;
import org.drools.chance.factmodel.ChanceTraitBuilderImpl;
import org.drools.chance.factmodel.ChanceTriplePropertyWrapperClassBuilderImpl;
import org.drools.chance.factmodel.ChanceTripleProxyBuilderImpl;
import org.drools.factmodel.ClassBuilderFactory;
import org.drools.factmodel.traits.TraitFactory;
import org.drools.io.impl.ClassPathResource;
import org.drools.runtime.StatefulKnowledgeSession;
public class JacksonSample{
public void ground() {
    Chance.initialize();
    KnowledgeBuilder kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(Chance.getChanceKBuilderConfiguration());
    kBuilder.add(new ClassPathResource("org/drools/chance/factmodel/testImperfectRules.drl"), ResourceType.DRL);
    if (kBuilder.hasErrors()) {
        fail(kBuilder.getErrors().toString());
    }
    KnowledgeBase kBase = KnowledgeBaseFactory.newKnowledgeBase(Chance.getChanceKnowledgeBaseConfiguration());
    kBase.addKnowledgePackages(kBuilder.getKnowledgePackages());
    kSession = kBase.newStatefulKnowledgeSession();
    kSession.setGlobal("list", list);
    kSession.fireAllRules();
}
}import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.chance.Chance;
import org.drools.chance.factmodel.ChanceBeanBuilderImpl;
import org.drools.chance.factmodel.ChanceTraitBuilderImpl;
import org.drools.chance.factmodel.ChanceTriplePropertyWrapperClassBuilderImpl;
import org.drools.chance.factmodel.ChanceTripleProxyBuilderImpl;
import org.drools.factmodel.ClassBuilderFactory;
import org.drools.factmodel.traits.TraitFactory;
import org.drools.io.impl.ClassPathResource;
import org.drools.runtime.StatefulKnowledgeSession;
public class JacksonSample{
public void ground() {
    Chance.initialize();
    KnowledgeBuilder kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(Chance.getChanceKBuilderConfiguration());
    kBuilder.add(new ClassPathResource("org/drools/chance/factmodel/testImperfectRules.drl"), ResourceType.DRL);
    if (kBuilder.hasErrors()) {
        fail(kBuilder.getErrors().toString());
    }
    KnowledgeBase kBase = KnowledgeBaseFactory.newKnowledgeBase(Chance.getChanceKnowledgeBaseConfiguration());
    kBase.addKnowledgePackages(kBuilder.getKnowledgePackages());
    kSession = kBase.newStatefulKnowledgeSession();
    kSession.setGlobal("list", list);
    kSession.fireAllRules();
}
}