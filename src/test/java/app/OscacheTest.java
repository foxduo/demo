package app;


import java.util.Date;
import com.opensymphony.oscache.base.NeedsRefreshException;
import com.opensymphony.oscache.general.GeneralCacheAdministrator;
/**
 * Created by FOX_duo on 2018/9/25.
 */
public class OscacheTest  extends GeneralCacheAdministrator{

        private static final long serialVersionUID = -4397192926052141162L;
        private String keyPrefix; //关键字前缀字符,区别属于哪个模块
        private int refreshPeriod; //过期时间(单位为秒);
        public OscacheTest(String keyPrefix,int refreshPeriod){
            super();
            this.keyPrefix = keyPrefix;
            this.refreshPeriod = refreshPeriod;
        }
        /**
         *
         * put(添加被缓存的对象)
         * @param key
         * @param value
         * @return void
         * @since1.0.0
         */
        public void put(String key,Object value){
            this.putInCache(this.keyPrefix+"_"+key,value);
        }
        /**
         * remove(删除被缓存的对象)
         * @param key
         * @return void
         * @since1.0.0
         */
        public void remove(String key){
            this.flushEntry(this.keyPrefix+"_"+key);
        }
        /**
         * removeAll(删除指定日期所有被缓存的对象)
         * @param date
         * @return void
         * @since1.0.0
         */
        public void removeAll(Date date){
            this.flushAll(date);
        }
        /**
         * removeAll(删除所有被缓存的对象)
         * @return void
         * @since1.0.0
         */
        public void removeAll(){
            this.flushAll();
        }
        /**
         * get(获取被缓存的对象)
         * @param key
         * @return
         * @throws Exception
         * @return Object
         * @since1.0.0
         */
        public Object get(String key) throws Exception{
            try{
                return this.getFromCache(this.keyPrefix+"_"+key,this.refreshPeriod);
            } catch (NeedsRefreshException e) {
                this.cancelUpdate(this.keyPrefix+"_"+key);
                e.printStackTrace();
                throw e;
            }
        }
    }
