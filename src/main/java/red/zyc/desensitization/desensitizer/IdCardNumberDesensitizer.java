/*
 * Copyright 2019 the original author or authors.
 *
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
package red.zyc.desensitization.desensitizer;


import red.zyc.desensitization.annotation.IdCardNumberSensitive;

/**
 * 身份证号码脱敏器
 *
 * @author zyc
 */
public class IdCardNumberDesensitizer extends AbstractCharSequenceDesensitizer<CharSequence, IdCardNumberSensitive> implements Desensitizer<CharSequence, IdCardNumberSensitive> {

    @Override
    public CharSequence desensitize(CharSequence target, IdCardNumberSensitive annotation) {
        return super.desensitizeCharSequence(CharSequenceSensitiveDescriptor.<CharSequence, IdCardNumberSensitive>builder()
                .target(target)
                .annotation(annotation)
                .startOffset(annotation.startOffset())
                .endOffset(annotation.endOffset())
                .regexp(annotation.regexp())
                .placeholder(annotation.placeholder())
                .build());
    }

}
