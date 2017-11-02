package omar.jpip

import omar.oms.ChipperUtil
import groovy.util.logging.Slf4j

@Slf4j
class JpipStageJob {

   def jpipService
   def concurrent = false

   static triggers = {
      simple repeatInterval: 5000l // execute job once in 5 seconds
   }

   def execute() {
      println "EXECUTING JOB!!!!!!!!!!!!!!!!!!!"
      def job
      log.info("Executing job");
      while(job = jpipService.nextJob())
      {
         log.info("processing job ${job?.jpipId}")
         jpipService.convertImage(job)
      }
   }
}
