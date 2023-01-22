package com.conuhacks.nbc.persistency;

import com.conuhacks.nbc.model.Operation;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Data
@RequiredArgsConstructor
public class OperationPersistence {

    private Map<String, Operation> operations;

}
