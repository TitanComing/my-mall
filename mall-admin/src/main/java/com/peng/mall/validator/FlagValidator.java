package com.peng.mall.validator;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * 用户验证状态是否在指定范围内的注解
 * Created by peng on 2020/5/5.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = FlagValidatorClass.class)
public @interface FlagValidator {
}
