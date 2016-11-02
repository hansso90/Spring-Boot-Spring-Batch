package nl.lemkes.springboot.standalone.batch.step1;

import nl.lemkes.springboot.standalone.batch.model.Data;
import nl.lemkes.springboot.standalone.batch.repository.DataRepository;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

/**
 * Created by Hans on 2-11-2016.
 */
public class FillDataTasklet implements Tasklet {

    private static int VALUE = 12;

    @Autowired
    private DataRepository dataRepository;

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {

        for(int i = 0; i < VALUE; i++)
        {
            Data data = new Data();
            data.setData(UUID.randomUUID().toString());
            dataRepository.save(data);
        }
        return RepeatStatus.FINISHED;
    }

}
