package top.yulegou.zeus.dao.domain.publish;/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author irisroyalty
 * @date 2020/6/24
 **/
@Data
public class ZBasePublishRuleConfig implements Serializable {
    /**
     * 冗余字段, 方便查询自己是哪种类型的发布配置
     */
    public Integer type;
}
